import "./Home.css"
import { Link } from "react-scroll";

const Home = () => {
  return (
    <div className='container'>
        <div className="main">
            <h2>Restaurante | A Casa da Comida</h2>
        </div>

        <div className="background">    
            <div className="img-restaurante">
                <img src="src\image\restaurante.jpg" alt="restaurante" />
            </div>
        </div>

        <div className="text-main">
            <h1>Restaurante</h1>
            <h1>A Casa da Comida</h1>
            <h2>Aonde você come de tudo de A-Z</h2>
            <p>Nosso restaurante é completo e com um cardápio muito diverso!</p>
            <Link spy={true} to='cardapio' smooth={true} activeClass='activeClass' offset={100}>
                <button>Cardápio</button>
            </Link>
        </div>
    </div>
  )
}

export default Home
